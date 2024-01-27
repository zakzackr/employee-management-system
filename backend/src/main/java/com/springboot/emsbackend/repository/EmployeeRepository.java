package com.springboot.emsbackend.repository;

import com.springboot.emsbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepositoryインターフェイスを継承するRepositoryインターファイス（EmployeeRepository）を定義することで、
// 自分で実装することなく基本的なCRUD操作を行うためのメソッドを使用することができる。

// 今回の例では、employeeRepository.findById(70)をServiceクラスのgetEmployeeByIdメソッド内で実行して
// データベースからID:70の従業員のデータを取得している。
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}





















// EmployeeRepository gets CRUD methods to perform CRUD database operations on Employee JPA entity
