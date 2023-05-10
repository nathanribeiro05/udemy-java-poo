/*Instancie manualmente (hard code) os objetos mostrados abaixo e mostre-os
na tela do terminal, conforme exemplo.

Exemplo: 

Traveling to New Zealand
12 Likes - 21/06/2018 13:05:44
I'm going to visit this wonderful country!
Comments:
Have a nice trip
Wow that's awesome!

Good night guys
5 Likes - 28/07/2018 23:14:19
See you tomorrow
Comments:
Good night
May the Force be with you*/

package Aplication;

import java.text.SimpleDateFormat;

import Entities.Comment;
import Entities.Post;

public class Program {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
       
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow, that's awesome!");
        Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);  
        post1.addComment(c1);
        post1.addComment(c2);

        System.out.println(post1);
        
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
        post2.addComment(c3);
        post2.addComment(c4);

        System.out.println(post2);
    }
}
