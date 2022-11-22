package practice.Polymorphism.LabAction;

//Thái độ
public abstract class Action {
    protected int point;
    protected Article article;

    public abstract String showNotifications(int articleID);

    public int getPoint() {
        return this.point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
