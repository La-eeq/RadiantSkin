/* Employee.java

     Employee POJO class

     Author: Samkelo Mahlangu (230064019)

     Date: 19 June 2026 */

package ac.za.mycput.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected String productId;
    protected String name;
    protected String description;
    protected String brand;
    protected BigDecimal price;
    protected int stockQuantity;
    protected String imageURL;
    protected int VolumeMl;


    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", imageURL='" + imageURL + '\'' +
                ", VolumeMl=" + VolumeMl +
                '}';
    }
}
