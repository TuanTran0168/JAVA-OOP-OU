package practice.Polymorphism.LabAction;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Position.Bias;

public class ArticleManagement {
    private List<Article> articleList = new ArrayList<Article>();

    public void addArticle(Article article) {
        this.articleList.add(article);
    }

    public void deleteArticle() {
        if (this.articleList.size() > 0) {
            int lastElement = this.articleList.size() - 1;
            this.articleList.remove(lastElement);
        }
    }

    public void showArticleList() {
        this.articleList.forEach(article -> {
            article.showOneArticle();
            System.out.println();
        });
    }

    //Tìm kiểu cũ
    public List<Article> searchAllArticleMostLike1() {
        if (this.articleList.size() > 0) {
            List<Article> articleListTemp = new ArrayList<Article>();
            Article maxArticleLike = this.articleList.get(0);

            for (Article article : articleList) {
                if (article.countLike() > maxArticleLike.countLike())
                    maxArticleLike = article;
            }

            for (Article article : articleList) {
                if (article.countLike() == maxArticleLike.countLike())
                    articleListTemp.add(article);
            }
            return articleListTemp;
        }

        return null;
    }

    //Tìm kiểu mới
    public List<Article> searchAllArticleMostLike() {
        if (this.articleList.size() > 0) {
            Article maxArticleLike = this.articleList.stream()
                    .max((article1, article2) -> article1.countLike() - article2.countLike()).get();
            return this.articleList.stream().filter(article -> (article.countLike() == maxArticleLike.countLike()))
                    .toList();
        }
        return null;
    }

    //Sắp xếp giảm dần theo điểm
    public void sortDescendingOrderByPoint() {
       this.articleList.sort((article1, article2) -> -(article1.sumPoint() - article2.sumPoint()));
    }

    public int searchAndCountLoveArticle(int articleID) {
        return this.articleList.stream().filter(article -> article.getArticleID() == articleID).findFirst().get()
                .countLove();
    }

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }
}
