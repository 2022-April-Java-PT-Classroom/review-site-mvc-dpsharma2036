package org.wecancoeit.reviews;

public class Review {
    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private String category;
    private String content;


    public Review(Long id, String title, String description, String imageUrl, String category, String content) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.category = category;
        this.content = content;

    }

    public Long getId() {

        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {

        return description;
    }

    public String getImageUrl() {

        return imageUrl;
    }

    public String getCategory() {

        return category;
    }

    public String getContent() {

        return content;
    }

}

