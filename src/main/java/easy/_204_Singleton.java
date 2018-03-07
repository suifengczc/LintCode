package easy;

public class _204_Singleton {
    /**
     * @return: The same instance of this class every time
     */
    public static _204_Singleton getInstance() {
        // write your code here
        return singletonHolder.newInsance;
    }

    private _204_Singleton() {
    }

    private static class singletonHolder{
        private static _204_Singleton newInsance = new _204_Singleton();
    }
}
