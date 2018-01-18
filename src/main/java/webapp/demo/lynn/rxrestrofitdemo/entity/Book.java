package webapp.demo.lynn.rxrestrofitdemo.entity;

import java.util.List;

/**
 * Created by lynn on 2018/1/18.
 */

public class Book {


    /**
     * count : 1
     * start : 0
     * total : 18
     * books : [{"rating":{"max":10,"numRaters":201989,"average":"9.1","min":0},"subtitle":"","author":["[日] 东野圭吾"],"pubdate":"2008-9","tags":[{"count":43256,"name":"東野圭吾","title":"東野圭吾"},{"count":36786,"name":"东野圭吾","title":"东野圭吾"},{"count":36702,"name":"推理","title":"推理"},{"count":31191,"name":"日本","title":"日本"},{"count":20886,"name":"悬疑","title":"悬疑"},{"count":17335,"name":"小说","title":"小说"},{"count":16442,"name":"日本文学","title":"日本文学"},{"count":15954,"name":"推理小说","title":"推理小说"}],"origin_title":"白夜行","image":"https://img3.doubanio.com/mpic/s4610502.jpg","binding":"平装","translator":["刘姿君"],"catalog":"","pages":"467","images":{"small":"https://img3.doubanio.com/spic/s4610502.jpg","large":"https://img3.doubanio.com/lpic/s4610502.jpg","medium":"https://img3.doubanio.com/mpic/s4610502.jpg"},"alt":"https://book.douban.com/subject/3259440/","id":"3259440","publisher":"南海出版公司","isbn10":"754424251X","isbn13":"9787544242516","title":"白夜行","url":"https://api.douban.com/v2/book/3259440","alt_title":"白夜行","author_intro":"东野圭吾，日本著名作家。1958年生于大阪。1985年，以第31届江户川乱步奖获奖作品《放学后》出道，开始扬名立万。20年作品逾60部，几乎囊括日本所有大奖：1999年，《秘密》获第52届日本推理作家协会奖，入围第120届直木奖；2000年，《白夜行》入围第122届直木奖；2001年，《暗恋》入围第125届直木奖；2004年，《幻夜》入围第131届直木奖；2006年的《嫌疑人X的献身》，获得第134届直木奖、第6届本格推理小说大奖。\n《白夜行》出版之后引起巨大轰动，使东野圭吾成为天王级作家。小说被改编成同名电视连续剧，与图书一同为作家带来了如潮好评，使他成为日本、韩国与台湾等地最受欢迎的作家之一。","summary":"\u201c只希望能手牵手在太阳下散步\u201d，这个象征故事内核的绝望念想，有如一个美丽的幌子，随着无数凌乱、压抑、悲凉的故事片段像纪录片一样一一还原：没有痴痴相思，没有海枯石烂，只剩下一个冰冷绝望的诡计，最后一丝温情也被完全抛弃，万千读者在一曲救赎罪恶的凄苦爱情中悲切动容\u2026\u2026","series":{"id":"868","title":"新经典文库·东野圭吾作品"},"price":"29.80元"}]
     */

    private int count;
    private int start;
    private int total;
    private List<BooksBean> books;

    public static Book objectFromData(String str) {

        return new com.google.gson.Gson().fromJson(str, Book.class);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<BooksBean> getBooks() {
        return books;
    }

    public void setBooks(List<BooksBean> books) {
        this.books = books;
    }

    public static class BooksBean {
        /**
         * rating : {"max":10,"numRaters":201989,"average":"9.1","min":0}
         * subtitle :
         * author : ["[日] 东野圭吾"]
         * pubdate : 2008-9
         * tags : [{"count":43256,"name":"東野圭吾","title":"東野圭吾"},{"count":36786,"name":"东野圭吾","title":"东野圭吾"},{"count":36702,"name":"推理","title":"推理"},{"count":31191,"name":"日本","title":"日本"},{"count":20886,"name":"悬疑","title":"悬疑"},{"count":17335,"name":"小说","title":"小说"},{"count":16442,"name":"日本文学","title":"日本文学"},{"count":15954,"name":"推理小说","title":"推理小说"}]
         * origin_title : 白夜行
         * image : https://img3.doubanio.com/mpic/s4610502.jpg
         * binding : 平装
         * translator : ["刘姿君"]
         * catalog :
         * pages : 467
         * images : {"small":"https://img3.doubanio.com/spic/s4610502.jpg","large":"https://img3.doubanio.com/lpic/s4610502.jpg","medium":"https://img3.doubanio.com/mpic/s4610502.jpg"}
         * alt : https://book.douban.com/subject/3259440/
         * id : 3259440
         * publisher : 南海出版公司
         * isbn10 : 754424251X
         * isbn13 : 9787544242516
         * title : 白夜行
         * url : https://api.douban.com/v2/book/3259440
         * alt_title : 白夜行
         * author_intro : 东野圭吾，日本著名作家。1958年生于大阪。1985年，以第31届江户川乱步奖获奖作品《放学后》出道，开始扬名立万。20年作品逾60部，几乎囊括日本所有大奖：1999年，《秘密》获第52届日本推理作家协会奖，入围第120届直木奖；2000年，《白夜行》入围第122届直木奖；2001年，《暗恋》入围第125届直木奖；2004年，《幻夜》入围第131届直木奖；2006年的《嫌疑人X的献身》，获得第134届直木奖、第6届本格推理小说大奖。
         《白夜行》出版之后引起巨大轰动，使东野圭吾成为天王级作家。小说被改编成同名电视连续剧，与图书一同为作家带来了如潮好评，使他成为日本、韩国与台湾等地最受欢迎的作家之一。
         * summary : “只希望能手牵手在太阳下散步”，这个象征故事内核的绝望念想，有如一个美丽的幌子，随着无数凌乱、压抑、悲凉的故事片段像纪录片一样一一还原：没有痴痴相思，没有海枯石烂，只剩下一个冰冷绝望的诡计，最后一丝温情也被完全抛弃，万千读者在一曲救赎罪恶的凄苦爱情中悲切动容……
         * series : {"id":"868","title":"新经典文库·东野圭吾作品"}
         * price : 29.80元
         */

        private RatingBean rating;
        private String subtitle;
        private String pubdate;
        private String origin_title;
        private String image;
        private String binding;
        private String catalog;
        private String pages;
        private ImagesBean images;
        private String alt;
        private String id;
        private String publisher;
        private String isbn10;
        private String isbn13;
        private String title;
        private String url;
        private String alt_title;
        private String author_intro;
        private String summary;
        private SeriesBean series;
        private String price;
        private List<String> author;
        private List<TagsBean> tags;
        private List<String> translator;

        public static BooksBean objectFromData(String str) {

            return new com.google.gson.Gson().fromJson(str, BooksBean.class);
        }

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getPubdate() {
            return pubdate;
        }

        public void setPubdate(String pubdate) {
            this.pubdate = pubdate;
        }

        public String getOrigin_title() {
            return origin_title;
        }

        public void setOrigin_title(String origin_title) {
            this.origin_title = origin_title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getBinding() {
            return binding;
        }

        public void setBinding(String binding) {
            this.binding = binding;
        }

        public String getCatalog() {
            return catalog;
        }

        public void setCatalog(String catalog) {
            this.catalog = catalog;
        }

        public String getPages() {
            return pages;
        }

        public void setPages(String pages) {
            this.pages = pages;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getIsbn10() {
            return isbn10;
        }

        public void setIsbn10(String isbn10) {
            this.isbn10 = isbn10;
        }

        public String getIsbn13() {
            return isbn13;
        }

        public void setIsbn13(String isbn13) {
            this.isbn13 = isbn13;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAlt_title() {
            return alt_title;
        }

        public void setAlt_title(String alt_title) {
            this.alt_title = alt_title;
        }

        public String getAuthor_intro() {
            return author_intro;
        }

        public void setAuthor_intro(String author_intro) {
            this.author_intro = author_intro;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public SeriesBean getSeries() {
            return series;
        }

        public void setSeries(SeriesBean series) {
            this.series = series;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public List<String> getAuthor() {
            return author;
        }

        public void setAuthor(List<String> author) {
            this.author = author;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public List<String> getTranslator() {
            return translator;
        }

        public void setTranslator(List<String> translator) {
            this.translator = translator;
        }

        public static class RatingBean {
            /**
             * max : 10
             * numRaters : 201989
             * average : 9.1
             * min : 0
             */

            private int max;
            private int numRaters;
            private String average;
            private int min;

            public static RatingBean objectFromData(String str) {

                return new com.google.gson.Gson().fromJson(str, RatingBean.class);
            }

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getNumRaters() {
                return numRaters;
            }

            public void setNumRaters(int numRaters) {
                this.numRaters = numRaters;
            }

            public String getAverage() {
                return average;
            }

            public void setAverage(String average) {
                this.average = average;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }

            @Override
            public String toString() {
                return "RatingBean{" +
                        "max=" + max +
                        ", numRaters=" + numRaters +
                        ", average='" + average + '\'' +
                        ", min=" + min +
                        '}';
            }
        }

        public static class ImagesBean {
            /**
             * small : https://img3.doubanio.com/spic/s4610502.jpg
             * large : https://img3.doubanio.com/lpic/s4610502.jpg
             * medium : https://img3.doubanio.com/mpic/s4610502.jpg
             */

            private String small;
            private String large;
            private String medium;

            public static ImagesBean objectFromData(String str) {

                return new com.google.gson.Gson().fromJson(str, ImagesBean.class);
            }

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class SeriesBean {
            /**
             * id : 868
             * title : 新经典文库·东野圭吾作品
             */

            private String id;
            private String title;

            public static SeriesBean objectFromData(String str) {

                return new com.google.gson.Gson().fromJson(str, SeriesBean.class);
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class TagsBean {
            /**
             * count : 43256
             * name : 東野圭吾
             * title : 東野圭吾
             */

            private int count;
            private String name;
            private String title;

            public static TagsBean objectFromData(String str) {

                return new com.google.gson.Gson().fromJson(str, TagsBean.class);
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        @Override
        public String toString() {
            return "BooksBean{" +
                    "rating=" + rating +
                    ", subtitle='" + subtitle + '\'' +
                    ", pubdate='" + pubdate + '\'' +
                    ", origin_title='" + origin_title + '\'' +
                    ", image='" + image + '\'' +
                    ", binding='" + binding + '\'' +
                    ", catalog='" + catalog + '\'' +
                    ", pages='" + pages + '\'' +
                    ", images=" + images +
                    ", alt='" + alt + '\'' +
                    ", id='" + id + '\'' +
                    ", publisher='" + publisher + '\'' +
                    ", isbn10='" + isbn10 + '\'' +
                    ", isbn13='" + isbn13 + '\'' +
                    ", title='" + title + '\'' +
                    ", url='" + url + '\'' +
                    ", alt_title='" + alt_title + '\'' +
                    ", author_intro='" + author_intro + '\'' +
                    ", summary='" + summary + '\'' +
                    ", series=" + series +
                    ", price='" + price + '\'' +
                    ", author=" + author +
                    ", tags=" + tags +
                    ", translator=" + translator +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "count=" + count +
                ", start=" + start +
                ", total=" + total +
                ", books=" + books +
                '}';
    }
}
