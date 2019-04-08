package yanrui.IO.IO;

import java.io.*;

public class FileTest {

    public static void FileStreamTest(){
        File file = new File("filetest.txt");//产生一个新的文件
        try {
            FileOutputStream OutputStream = new FileOutputStream(file);
            OutputStreamWriter writer = new OutputStreamWriter(OutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("my name is yr");
            bufferedWriter.close();

            FileInputStream inputStream = new FileInputStream("filetest.txt");
            byte[] bytes = new byte[4];
            inputStream.read(bytes);
            String str = new String(bytes);
            System.out.println(str);
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader reader1 = new BufferedReader(reader);
            System.out.println(reader1.readLine());

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args){
        FileStreamTest();
    }
}
