import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(Parameterized.class)
public class IngredientTypeTest {
    IngredientType type;

    public IngredientTypeTest(IngredientType type) {
        this.type = type;
    }

    @Parameterized.Parameters(name = "Тестовые данные: IngredientType = {0} expected = {1}")
    public static Object[][] getData() {
        return new Object[][]{
                {IngredientType.SAUCE},
                {IngredientType.FILLING}
        };
    }

    @Test
    public void checkIngredientTypeFilling() {
        Ingredient ingredient = new Ingredient(type, "hot sauce", 100);
        Assert.assertEquals(type, ingredient.getType());
    }
}
