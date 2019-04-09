package middle;

/**
 * _074_FindFirstBadVersion 辅助类
 */
public class SVNRepo {
    public static  boolean isBadVersion(int k){
        return k >= 2147483647;
    }
}
