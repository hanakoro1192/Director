
public class TextBuilder extends Builder{

    //フィールドの設定
    private StringBuffer buffer = new StringBuffer(); //このフィールドに文書を構築していく.StringBufferはappendを呼び出す

    public void makeTitle(String title){ //テンプレートのタイトル
        buffer.append("==============¥n"); //飾り付け
        buffer.append("「" + title + "」"); //[]のタイトル
        buffer.append("¥n"); //空行
    };

    public void makeString(String str){ //プレーンテキストでの文字列
        buffer.append('■' + str + "¥n"); //■つきの文字列
        buffer.append("¥n"); //空行
    }

    public void makeItem(String[] item){
        for(int i = 0; i < items.length; i++){ 
            buffer.append("・" + items[i] + "¥n"); //・つきの項目
        }
        buffer.append("¥n"); //空行
    }

    public void close(){
        buffer.append("===============¥n");
    }

    public void getResult(){ //完成した文章
        return buffer.toString(); //StringBufferをStringに変換
    }

}