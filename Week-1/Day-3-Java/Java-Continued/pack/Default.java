package pack;

/*
    Notice this class is in the default scope: classes can be public or default scope,
    not protected or private. The exception to this rule is if a class is defined inside
    of another class
 */
class Default {
    // default scope resources can be accessed in the same package
    String defaultScopeString;
    int defaultScopeInt;

    public Default(String defaultScopeString, int defaultScopeInt){
        this.defaultScopeString = defaultScopeString;
        this.defaultScopeInt = defaultScopeInt;
    }
}
