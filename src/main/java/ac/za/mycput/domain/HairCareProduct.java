/* Employee.java

     Employee POJO class

     Author: Samkelo Mahlangu (230064019)

     Date: 19 June 2026 */

package ac.za.mycput.domain;

import java.math.BigDecimal;

public class HairCareProduct extends Product{

    private String hairConcern;

    public HairCareProduct() {
    }

    private HairCareProduct(Builder builder) {
        this.productId = builder.productId;
        this.name = builder.name;
        this.description = builder.description;
        this.brand = builder.brand;
        this.price = builder.price;
        this.stockQuantity = builder.stockQuantity;
        this.imageURL = builder.imageURL;
        this.VolumeMl = builder.VolumeMl;
        this.hairConcern = builder.hairConcern;
    }

    public String getHairConcern() {
        return hairConcern;
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
        private String hairConcern;

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
            this.VolumeMl = volumeMl;
            return this;
        }

        public Builder setHairConcern(String hairConcern) {
            this.hairConcern = hairConcern;
            return this;
        }

        public HairCareProduct build() {
            return new HairCareProduct(this);
        }
    }
}
