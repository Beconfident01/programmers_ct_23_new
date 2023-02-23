package com.ll.level0.p120807;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    @DisplayName("2,3 =>-1")
    void t1(){
        assertThat(new Solution().solution(2,3)).isEqualTo(-1);

    }
}
