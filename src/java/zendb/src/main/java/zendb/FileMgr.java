package zendb;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileMgr {
  public static void fileRandomAccess() {
    try {
      RandomAccessFile f = new RandomAccessFile("./text.txt", "rws");
      // f.seek(4);
      f.writeChar(0x68);
      f.writeChar(0x65);
      f.writeChar(0x6c);
      f.writeChar(0x6c);
      f.writeChar(0x6f);

      // 移動
      f.seek(0);
      char n = f.readChar();
      System.out.print(n);
      n = f.readChar();
      System.out.print(n);
      n = f.readChar();
      System.out.print(n);
      n = f.readChar();
      System.out.print(n);
      n = f.readChar();
      System.out.println(n);

      f.close();
    } catch (FileNotFoundException e) {
      System.err.println("File not found.");
    } catch (IOException e) {
      System.err.println("Exception on I/O occured");
    }
  }
}
