package org.techstore.fullstack.Projection;

public interface CategorySlim {
    Long getId();
    String getCategoryName();

    ProductWithId getProducts();

    interface  ProductWithId{
        Integer getId();
        String getName();
        String getDescription();
    }
}
