package webbook.api.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_book")
public class Book extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(nullable = false, unique = true)
    private String code;

    @NotNull
    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "int default 0")
    private Integer views;

    @Column(columnDefinition = "int default 0")
    private Integer downloads;

    @Column(columnDefinition = "boolean default false")
    private Boolean active;

    @Column(name = "file_path", nullable = false)
    private String filePath;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_info_id", nullable = false)
    private BookInfo bookInfo;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_category_id", nullable = false)
    private BookCategory bookCategory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public BookInfo getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }
}
