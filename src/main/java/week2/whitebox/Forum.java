package week2.whitebox;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Forum {
    private List<ForumPost> posts = new ArrayList<>();
    private final String name;

    public Forum(final String name) {
        this.name = name;
    }

    public Forum(final String name, final List<ForumPost> posts) {
        this.posts = posts;
        this.name = name;
    }

    public List<ForumPost> getPosts() {
        return posts;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfPosts() {
        return posts.size();
    }

    public void addPost(ForumPost post) {
        posts.add(post);
    }

    public void removePost(ForumPost post) {
        posts.remove(post);
    }

    public void removePost(int id) {
        Optional<ForumPost> forumPost = posts.stream().filter(post -> post.getId() == id).findFirst();
        forumPost.ifPresent(post ->
                posts.remove(post)
        );
    }

    public ForumPost getPostById(int id) {
        Optional<ForumPost> forumPost = posts.stream().filter(post -> post.getId() == id).findFirst();

        if (forumPost.isPresent()) {
            return forumPost.get();
        }
        throw new NoSuchElementException("No post found with id: " + id);
    }
}
