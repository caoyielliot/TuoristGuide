package org.me.tuoristguide.model;

/**
 * Created by danyang on 4/26/16.
 */
public class CommentList {
    public CommentList(String comment_id, String store_name, String comment_text, String created_time) {
        this.store_name = store_name;
        this.comment_text = comment_text;
        this.created_time = created_time;
        this.comment_id = comment_id;
    }

    private String created_time;
    private String store_name;
    private String comment_text;

    public String getComment_id() {
        return comment_id;
    }

    public void setComment_id(String comment_id) {
        this.comment_id = comment_id;
    }

    private String comment_id;

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public String getComment_text() {
        return comment_text;
    }

    public void setComment_text(String comment_text) {
        this.comment_text = comment_text;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

}
