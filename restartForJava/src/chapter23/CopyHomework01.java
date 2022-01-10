package chapter23;

import java.io.*;

/*
作业内容：将目录拷贝到其他路径中去；
 */
public class CopyHomework01 {
    public static void main(String[] args) {
        //原目录
        File srcFile = new File("C:\\CloudMusic");
        //新目录
        File destFile = new File("C:\\迅雷下载\\对手\\");
        //拷贝的方法
        copyFile(srcFile,destFile);
    }

    /**
     * 拷贝目录的方法
     * @param srcFile 拷贝源
     * @param destFile 拷贝目标
     */
    public static void copyFile(File srcFile,File destFile){
        //判断：如果file是一个文件的话，那么就结束递归了
        if (srcFile.isFile()){
            //如果srcFile是一个文件的话，递归就结束了
            //是文件的话就可以拷贝了
            //一边读一边写
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                in = new FileInputStream(srcFile);
                //给一个path
                String path = (destFile.getAbsolutePath().endsWith("\\")? destFile.getAbsoluteFile() : destFile.getAbsolutePath() + "\\")
                        + srcFile.getAbsolutePath().substring(3);
                out = new FileOutputStream(path);
                byte[] bytes = new byte[1024 * 1024];
                int readCount = 0;
                while ((readCount = in.read(bytes)) != -1){
                    out.write(bytes,0,readCount);
                }
                //要记得刷新
                out.flush();;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
            return;
        }
        //获取当前左右的子目录
        File[] files = srcFile.listFiles();
        for (File file: files){
            //测试打印出拷贝源的所有绝对路径
            //System.out.println(file.getAbsolutePath());
            if (file.isDirectory()){
                //新建对应的目录
                //可以拿到所有的目录
                //System.out.println(file.getAbsolutePath());
                //将绝对路径转成字符串
                String srcDir = file.getAbsolutePath();
                //截取字符串
                String destDir = (destFile.getAbsolutePath().endsWith("\\")? destFile.getAbsoluteFile() : destFile.getAbsolutePath() + "\\")
                        + srcDir.substring(3);
                //新建目录
                File newFile = new File(destDir);
                if (!newFile.exists()){
                    newFile.mkdirs();
                }

                //System.out.println(destDir);

            }
            //递归调用
            copyFile(file,destFile);

        }
    }
}
