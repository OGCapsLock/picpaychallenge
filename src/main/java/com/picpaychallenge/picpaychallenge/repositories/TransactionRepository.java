package com.picpaychallenge.picpaychallenge.repositories;

import com.picpaychallenge.picpaychallenge.domain.transation.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
