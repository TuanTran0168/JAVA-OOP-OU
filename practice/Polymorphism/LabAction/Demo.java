package practice.Polymorphism.LabAction;

public class Demo {
    public static void main(String[] args) {
        Article bv1 = new Article("AAA", "BBBBBBBBBBBBBB");
        Article bv2 = new Article("CCC", "DDDDDDDDDDDDDDDDDDDD");
        Article bv3 = new Article("EEE", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        Article bv4 = new Article("GGGG", "HHHHHHHHHHHHHHHHHHHHHHHHHH");
        Article bv5 = new Article("IIIII", "KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
        Article bv6 = new Article("LLLLL", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
        Article bv7 = new Article("NNNNNNNN", "OOOOOOOOOOOOOOOOOOOO");

        Action like = new Like();
        Action love = new Love();
        Action dislike = new Dislike();

        ArticleManagement managementList = new ArticleManagement();
        managementList.addArticle(bv1);
        bv1.addAction(like);
        bv1.addAction(like);
        bv1.addAction(like);
        bv1.addAction(like);
        managementList.addArticle(bv2);
        bv2.addAction(like);
        bv2.addAction(like);
        bv2.addAction(like);
        bv2.addAction(like);
        bv2.addAction(like);
        managementList.addArticle(bv3);
        bv3.addAction(dislike);
        bv3.addAction(like);
        bv3.addAction(like);
        managementList.addArticle(bv4);
        bv4.addAction(love);
        bv4.addAction(like);
        managementList.addArticle(bv5);
        bv5.addAction(like);
        bv5.addAction(like);
        bv5.addAction(like);
        bv5.addAction(like);
        bv5.addAction(like);
        bv5.addAction(love);
        bv5.addAction(love);
        bv5.addAction(dislike);
        
        managementList.addArticle(bv6);
        bv6.addAction(dislike);
        bv6.addAction(dislike);
        bv6.addAction(dislike);
        bv6.addAction(dislike);
        bv6.addAction(dislike);
        bv6.addAction(love);
        managementList.addArticle(bv7);
        bv7.addAction(love);
        bv7.addAction(love);
        bv7.addAction(love);
        bv7.addAction(love);
        bv7.addAction(love);
        bv7.addAction(like);

        managementList.showArticleList();


        System.out.println("=================== LIKE ===================");
        managementList.searchAllArticleMostLike().forEach(article -> article.showOneArticle());

        System.out.println("=================== LOVE ===================");
        System.out.println(managementList.searchAndCountLoveArticle(5));
        System.out.println(managementList.searchAndCountLoveArticle(7));
        System.out.println("=================== Sort Descending Order By Point ===================");
        managementList.sortDescendingOrderByPoint();
        managementList.showArticleList();
        // System.out.println(bv1.addAction(a1Artic));
        // System.out.println(bv1.addAction(a2));
        // System.out.println(bv1.addAction(a2));

        // System.out.println(bv2.addAction(a1));
        // System.out.println(bv2.addAction(a2));
        // System.out.println(bv2.addAction(a3));

        // bv1.showOneArticle();
        // bv2.showOneArticle();
    }
}
