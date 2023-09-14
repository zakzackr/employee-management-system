import React, { useEffect, useState } from 'react'
import { deleteDepartment, listDepartments } from '../services/DepartmentService'
import { Link, useNavigate } from 'react-router-dom'
import { updateEmployee } from '../services/EmployeeService'

const ListDepartmentComponent = () => {

    const [departments, setDepartments] = useState([])

    const navigator = useNavigate()

    useEffect(() => {
        getAllDepartments()
    }, [])

    function getAllDepartments(){
        listDepartments().then((response) => {
            setDepartments(response.data)
        }).catch(error => {
            console.error(error)
        })
    }

    function updateDepartment(id){
        navigator(`/update-department/${id}`)
    }

    function removeDepartment(id){
        deleteDepartment(id).then((response) => {
            console.log(response.data)
            getAllDepartments()
        }).catch(error => {
            console.error(error)
        })
    }
        
    return (
        <div className='container'>
            <h2 className='text-center mt-3'>List of Departments</h2>
            <Link to='/add-department' className='btn btn-primary mb-1'>Add Department</Link>
            <table className='table table-striped table-bordered'>
                <thead>
                    <tr>
                        <th>Department ID</th>
                        <th>Department Name</th>
                        <th>Department Description</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    {   
                        departments.map(department => 
                            <tr key={department.id}>
                                <td>{department.id}</td>
                                <td>{department.departmentName}</td>
                                <td>{department.departmentDescription}</td>
                                <td>
                                    {/* <Link to='/update-department' className='btn btn-primary'>Update</Link> */}
                                    <button className='btn btn-info' onClick={() => updateDepartment(department.id)}
                                        style={{marginRight: '10px'}}>Update</button>
                                    <button className='btn btn-danger' onClick={() => removeDepartment(department.id)}>Delete</button>
                                </td>
                            </tr>
                        )
                    }
                </tbody>
            </table>
        </div>
    )
}

export default ListDepartmentComponent