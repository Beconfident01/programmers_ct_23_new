package com.ll.level0.p120829;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("70도가 입력되었을때 결과는 1")
    void t1(){

        assertThat(new Solution().solution(70)).isEqualTo(1);
    }

    @Test
    @DisplayName("90도가 입력되었을때 결과는 2")
    void t2(){

        assertThat(new Solution().solution(90)).isEqualTo(2);
    }
    @Test
    @DisplayName("180도가 입력되었을때 결과는 4")
    void t3(){

        assertThat(new Solution().solution(180)).isEqualTo(4);
    }
    @Test
    @DisplayName("93도가 입력되었을때 결과는 3")
    void t4(){

        assertThat(new Solution().solution(93)).isEqualTo(3);
    }
}
