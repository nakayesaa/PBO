package PBO.week10;

public class CommentTester {
    public static void main(String[] args) {
        System.out.println("=== TESTING Comment CLASS ===");

        System.out.println("[TEST 1] Membuat objek Comment:");
        Comment c1 = new Comment("Kamal", "Produk ini keren banget, recommended!", 5);
        System.out.println("Author   : " + c1.getAuthor());
        System.out.println("Rating   : " + c1.getRating());
        System.out.println("Vote awal: " + c1.getVoteCount());
        System.out.println("Detail   :\n" + c1.getFullDetails());
        System.out.println("---------------------------------------------\n");

        System.out.println("[TEST 2] Melakukan upvote sebanyak 3 kali:");
        c1.upvote();
        c1.upvote();
        c1.upvote();
        System.out.println("Vote count setelah 3 upvote: " + c1.getVoteCount());
        System.out.println("Detail terbaru:\n" + c1.getFullDetails());
        System.out.println("---------------------------------------------\n");

        System.out.println("[TEST 3] Melakukan downvote 1 kali:");
        c1.downvote();
        System.out.println("Vote count setelah 1 downvote: " + c1.getVoteCount());
        System.out.println("Detail terbaru:\n" + c1.getFullDetails());
        System.out.println("---------------------------------------------\n");

        System.out.println("[TEST 4] Membuat komentar lain dengan rating 3:");
        Comment c2 = new Comment("Budi", "Lumayan, tapi pengiriman agak lama.", 3);
        System.out.println("Author   : " + c2.getAuthor());
        System.out.println("Rating   : " + c2.getRating());
        System.out.println("Vote awal: " + c2.getVoteCount());
        System.out.println("Detail   :\n" + c2.getFullDetails());
        System.out.println("---------------------------------------------\n");

        System.out.println("[TEST 5] Downvote beberapa kali sampai vote negatif:");
        c2.downvote();
        c2.downvote();
        c2.downvote();
        System.out.println("Vote count setelah 3 downvote: " + c2.getVoteCount());
        System.out.println("Detail terbaru:\n" + c2.getFullDetails());
        System.out.println("---------------------------------------------\n");

        System.out.println("[TEST 6] Debugging getter untuk komentar pertama:");
        System.out.println("getAuthor()  : " + c1.getAuthor());
        System.out.println("getRating()  : " + c1.getRating());
        System.out.println("getVoteCount(): " + c1.getVoteCount());
        System.out.println("getFullDetails():\n" + c1.getFullDetails());
        System.out.println("---------------------------------------------\n");

        System.out.println("=== SELESAI TESTING Comment CLASS ===");
    }
}
