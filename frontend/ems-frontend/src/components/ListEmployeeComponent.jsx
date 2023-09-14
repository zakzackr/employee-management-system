// import React from 'react'

// function ListEmployeeComponent() {
//   return (
//     <div>ListEmployeeComponent</div>
//   )
// }

// export default ListEmployeeComponent

import React, { useEffect, useState } from 'react'
import { deleteEmployee, listEmployees } from '../services/EmployeeService'
import { useNavigate } from 'react-router-dom'

const ListEmployeeComponent = () => {

    const [employees, setEmployees] = useState([])
    const navigator = useNavigate()

    // useEffect hook is used to perform side effects in a functional component
    useEffect(() => {
        getAllEmployees()
    }, [])

    function getAllEmployees(){
        listEmployees().then((response) => {
            setEmployees(response.data)
        }).catch(error => {
            console.error(error)
        })
    }

    function addNewEmployee(){
        navigator('/add-employee')
    }

    function updateEmployee(id){
        navigator(`/update-employee/${id}`)
    }

    function removeDelete(id){
        console.log(id)

        deleteEmployee(id).then((response) => {
            console.log(response.data)
            getAllEmployees()
        }).catch(error => {
            console.error(error)
        })
    }

  return (
    <div className='container'>
        <h2 className='text-center mt-3 '>List of Employees</h2>
        <button className='btn btn-primary mb-1' onClick={addNewEmployee}>Add Employee</button>
        <table className='table table-striped table-bordered'> 
            <thead>
                <tr>
                    <th>Employee ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                {
                    employees.map(employee => 
                        <tr key={employee.id}>
                            <td>{employee.id}</td>
                            <td>{employee.firstName}</td>
                            <td>{employee.lastName}</td>
                            <td>{employee.email}</td>
                            <td>
                                <button className='btn btn-info ' onClick={() => updateEmployee(employee.id)}>Update</button>
                                <button className='btn btn-danger' onClick={() => removeDelete(employee.id)}
                                    style={{marginLeft: '10px'}}
                                >Delete</button>
                            </td>
                        </tr>
                    )
                }
            </tbody>
        </table>
    </div>
  )
}

export default ListEmployeeComponent

