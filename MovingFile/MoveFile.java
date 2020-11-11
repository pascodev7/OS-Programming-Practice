package MovingFile;

import java.io.*;

public class MoveFile {

    public static void main(String[] args) {

        InputStream inStream = null;
        OutputStream outStream = null;

        try {

            File afile = new File("C:\\folderA\\Afile.txt");
            File bfile = new File("C:\\folderB\\Afile.txt");

            inStream = new FileInputStream(afile);
            outStream = new FileOutputStream(bfile);

            byte[] buffer = new byte[1024];

            int length;
            //copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }

            inStream.close();
            outStream.close();

            //delete the original file
            //afile.delete();

            System.out.println("File is copied successful!");

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}