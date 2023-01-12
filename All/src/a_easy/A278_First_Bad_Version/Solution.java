package a_easy.A278_First_Bad_Version;

import org.junit.jupiter.api.Test;

public class Solution extends VersionControl {
    @Test
    public void unitTest(){

    }

    public boolean[] historyVersion = new boolean[11];

    public void supposeVersion() {
        for (int i = 0; i <= 11; i++) {
            historyVersion[i] = true;
        }
    }

    @Override
    public boolean isBadVersion(int version) {
        return historyVersion[version];
    }

    public int firstBadVersion(int n) {
        return searchBadVersion(n, 1, n);
    }

    public int searchBadVersion(int n, int left, int right) {
        if (left > right) return left;
        int mid = (right + left) / 2;
        if (isBadVersion(mid)) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
        return searchBadVersion(n, left, right);
    }
}
