# AllowColorMod
'§' is available with AllowColorMod.

## Usage
You can speak colorful words.
*However, DO NOT USE IN SERVER or you'll be kicked out for "Illegal Charactors"*

## Theory
Rewrite the 'isValidChar(char)' in 'SharedConstant'.
```java
@Mixin(SharedConstant.class)
public class AllowColorMixin {

    public static boolean isValidChar(char c){
        return true;
    }

}
```