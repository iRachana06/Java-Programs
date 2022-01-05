import java.io.*;
public class FileReadWriteDemo {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("E:\\fileout.txt");
        BufferedWriter brwriter = new BufferedWriter(writer);
        //writer and brwriter are objects used to write to file

        FileReader reader=new FileReader("E:\\filedemo.txt");
        BufferedReader brreader=new BufferedReader(reader);
//reader and brreader are objects used to read data from file

        int i;
        while((i=brreader.read())!=-1){
            System.out.print((char)i);
        }
        brreader.close();
        reader.close(); //close brreader and reader after reading is completed

        brwriter.write("This line writes text to Fileout.txt");
        brwriter.close(); //close brwriter and writer after writing is completed

        System.out.println();
        System.out.println("Writing to file fileout.txt succeeded");
        //Hello Welcome to TechIEQ - is the content read from file
        //This line writes text to Fileout.txt is content written to file
    }
}


