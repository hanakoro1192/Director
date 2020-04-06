import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder{
    private int filename; //作成するファイル
    private PrintWriter writer; //ファイルに書き込むPrintWriter

    public void makeTitle(String title){
        filename = title + ".html";
        try{
            writer = new PrintWriter(new FileWriter(filename));
        }catch(IOException e){
            e.printStackTrace(); //printStackTraceは、Throwableクラスの「メソッド」.printStackTraceメソッドは、「スタックトレース」を出力
        }
        writer.println("<html><head><title>" + title + "<\title>");
        //タイトルを出力
        writer.println("<h1>" + title + "</h1>");
    }
    public void makeString(){ //HTMLファイルで文字列の作成をおこなう
        writer.println("<p>" + str + "</p>"); //<p>タグの出力を実施
    }
}