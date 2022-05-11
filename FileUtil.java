package labor11_3;

import java.io.*;

public interface FileUtil {
    public static void encode(String inputFileName, String outputFileName)
            throws IOException {
        try (InputStream in = new FileInputStream(inputFileName)) {
            try (OutputStream out = new FileOutputStream(outputFileName)) {
                int ch;
                while ((ch = in.read()) != -1) {
                    out.write((ch + 1) % 256);
                }
            }
        }
    }


    public static void decode(String inputFileName, String outputFileName)
            throws IOException{
        try (InputStream in = new FileInputStream(inputFileName)) {
            try (OutputStream out = new FileOutputStream(outputFileName)) {
                int ch;
                while ((ch = in.read()) != -1) {
                    if (ch==0)
                        out.write(255);
                    else
                        out.write(ch - 1);


                }
    try {
        FileUtil.encode("labor11/src/lab11_3/FileUtil.java", "temp1.java");
        FileUtil.decode("temp1.java", "temp2.java");
    } catch (IOException e) {
        e.printStackTrace();
        }
}
}

}
}
