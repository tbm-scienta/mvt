/*
 * Copyright 2016 Frode Torvund
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package model;

import java.util.Map;

/**
 *
 */
public class FoodItem {
    private String name;
    private ProductSubGroup productSubGroup;
    private Map<Nutrient, Double> nutrientMap;

    public FoodItem(String name, ProductSubGroup productSubGroup, Map<Nutrient, Double> nutrientMap) {
        this.name = name;
        this.productSubGroup = productSubGroup;
        this.nutrientMap = nutrientMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductSubGroup getProductSubGroup() {
        return productSubGroup;
    }

    public void setProductSubGroup(ProductSubGroup productSubGroup) {
        this.productSubGroup = productSubGroup;
    }

    public Map<Nutrient, Double> getNutrientMap() {
        return nutrientMap;
    }

    public void setNutrientMap(Map<Nutrient, Double> nutrientMap) {
        this.nutrientMap = nutrientMap;
    }
}