import java.util.ArrayList;
import java.util.List;

public class MakeupKit {
    private List<MakeupProduct> products = new ArrayList<>();

    public void addProduct(MakeupProduct product) {
        products.add(product);
    }

    public List<MakeupProduct> getProducts() {
        return new ArrayList<>(products); // защитная копия
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Makeup Kit:\n");
        for (MakeupProduct p : products) {
            sb.append("").append(p).append("\n");
        }
        return sb.toString();
    }
}
