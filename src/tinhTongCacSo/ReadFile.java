package tinhTongCacSo;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        readFile.readFileText("Test.txt");
    }
    public void readFileText(String filePath)  {
        FileInputStream inputStream = null;
        BufferedReader reader = null;
        int sum = 0;

        try {
            inputStream = new FileInputStream(filePath);
            reader = new BufferedReader(new InputStreamReader(inputStream));


            String line = "";
            while ((line = reader.readLine())!=null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (reader != null) {
                    reader.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("tong cac so trong file la: " + sum );
    }
}
