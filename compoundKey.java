import java.util.Locale;

public class compoundKey {
    private String str1;
    private String str2;

    public compoundKey(String s1, String s2) {
        this.str1 = s1;
        this.str2 = s2;
    }

    public String getStr1()
    {
        return str1;
    }

    public String getStr2()
    {
        return str2;
    }

    public String toString()
    {
        return str1 + "->" + str2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof compoundKey) {
            compoundKey s = (compoundKey) obj;
            return str1.equals(s.str1) && str2.equals(s.str2);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (str1 + "->" + str2).hashCode();
    }
}
