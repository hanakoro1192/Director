//Builderクラスの集約
public class Director {
    private Builder builder; //フィールドの設定
    
    //コンストラクタの設定
    public Director(Builder builder){ //引数をフィールドに設定する
        this.builder = builder; 
    }
    
    //UML図で設定したメソッドの作成
    public void construct(){ //文書構築
        builder.makeTitle("くまさんへの挨拶文"); //タイトル
        builder.makeString("毎日の朝"); //文字列
        builder.makeItem(new String[]{ //箇条書きにしている
            "おはようございます",
            "こんにちは"
        });

        builder.makeString("毎日の夜"); //別の文字列 
        builder.makeItem(new String[]{ //配列にしているため新しいインスタンスを用意している
            "昨日",
            "今日",
            "明後日"
        });
        builder.close(); //文章の完成
    }
}