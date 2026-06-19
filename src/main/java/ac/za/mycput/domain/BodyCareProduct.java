/* Employee.java

     Employee POJO class

     Author: Samkelo Mahlangu (230064019)

     Date: 19 June 2026 */




package ac.za.mycput.domain;

import java.math.BigDecimal;

public class BodyCareProduct extends Product {

    private String skinConcern;

    public BodyCareProduct() {
    }

    private BodyCareProduct(Builder builder) {
        this.productId = builder.productId;
        this.name = builder.name;
        this.description = builder.description;
        this.brand = builder.brand;
        this.price = builder.price;
        this.stockQuantity = builder.stockQuantity;
        this.imageURL = builder.imageURL;
        this.VolumeMl = builder.VolumeMl;
        this.skinConcern = builder.skinConcern;
    }

    public String getSkinConcern() {
        return skinConcern;
    }

    public static class Builder {
        private String productId;
        private String name;
        private String description;
        private String brand;
        private BigDecimal price;
        private int stockQuantity;
        private String imageURL;
        private int VolumeMl;
        private String skinConcern;

        public Builder setProductId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder setStockQuantity(int stockQuantity) {
            this.stockQuantity = stockQuantity;
            return this;
        }

        public Builder setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }

        public Builder setVolumeMl(int volumeMl) {
            VolumeMl = volumeMl;
            return this;
        }

        public Builder setSkinConcern(String skinConcern) {
            this.skinConcern = skinConcern;
            return this;
        }

        public BodyCareProduct build() {
            return new BodyCareProduct(this);
        }
    }
}
