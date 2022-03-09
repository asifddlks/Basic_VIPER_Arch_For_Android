package com.techetronventures.stockx.loginModule.validator

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class LoginValidatorTest {

    @Test
    fun empty_user_name_non_empty_pass_return_false(){

        val result = LoginValidator().validateUserNamePassword("","123456")
        assertThat(result.isSuccess).isFalse()
        assertThat(result.error).isEqualTo("User name empty")
        assertThat(result.index).isEqualTo(0)
    }
    @Test
    fun non_empty_user_name_empty_pass_return_false(){

        val result = LoginValidator().validateUserNamePassword("addd","")
        assertThat(result.isSuccess).isFalse()
        assertThat(result.error).isEqualTo("password empty")
        assertThat(result.index).isEqualTo(1)
    }

    @Test
    fun non_empty_user_name_non_empty_pass_return_true(){

        val result = LoginValidator().validateUserNamePassword("aaaaaaaaaaa","123456")
        assertThat(result.isSuccess).isTrue()
        assertThat(result.error).isEqualTo("")
        assertThat(result.index).isEqualTo(-1)
    }

}