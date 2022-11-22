package practice.Polymorphism.LabAction;

import java.util.ArrayList;
import java.util.List;

//Bài Viết
public class Article {
    public static int count = 0;
    private int articleID = ++count;
    private String title;
    private String content;
    private List<Action> actionList = new ArrayList<Action>();

    public int sumPoint() {
        int sumPoint = 0;
        if (this.actionList.size() > 0) {
            for (Action action : actionList) {
                sumPoint += action.point;
            }
        }
        return sumPoint;
    }

    public void showOneArticle() {
        System.out.println("Article id: " + this.articleID);
        System.out.println("Article title: " + this.title);
        System.out.println("Article content: " + this.content);
        System.out.println("Article point: " + this.sumPoint());
    }

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String addAction(Action action) {
        this.actionList.add(action);
        // action.article.articleID = this.articleID;
        return action.showNotifications(this.articleID);
    }

    public int countLike() {
        return (int) this.actionList.stream().filter(action -> action instanceof Like).count();
        // int count = 0;
        // for (Action action : actionList) {
        // if (action instanceof Like)
        // count++;
        // }
        // return count;
    }

    public int countLove() {
        return (int) this.actionList.stream().filter(action -> action instanceof Love).count();
        // int count = 0;
        // for (Action action : actionList) {
        // if (action instanceof Love)
        // count++;
        // }
        // return count;
    }

    public int countDislike() {
        int count = 0;
        for (Action action : actionList) {
            if (action instanceof Dislike)
                count++;
        }
        return count;
    }

    public int getArticleID() {
        return articleID;
    }

    public List<Action> getActionList() {
        return actionList;
    }

    public void setActionList(List<Action> actionList) {
        this.actionList = actionList;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArticleID(int articleID) {
        this.articleID = articleID;
    }
}
