//文章を構成するための抽象クラス。抽象クラスは直接インスタンス化は不可能
public abstract class Builder { //親クラスの抽象クラス
    public abstract void makeTitle(String title); //返り値がなし 引数のある理由
    public abstract void makeString(String str); //文章の型:文字列 
    public abstract void makeItem(String[] item); //引数には何かしらのアイテムを入れる：箇条書き
    public abstract void close();
}