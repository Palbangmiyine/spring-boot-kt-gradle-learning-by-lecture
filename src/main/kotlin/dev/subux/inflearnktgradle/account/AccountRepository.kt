package dev.subux.inflearnktgradle.account

import org.springframework.data.repository.CrudRepository

interface AccountRepository : CrudRepository<Account, String> {
}