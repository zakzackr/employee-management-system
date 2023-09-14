import './App.css'
import ListEmployeeComponent from './components/ListEmployeeComponent'
import EmployeeComponent from './components/EmployeeComponent'
import FooterComponent from './components/FooterComponent'
import HeaderComponent from './components/HeaderComponent'
import {BrowserRouter, Routes, Route} from 'react-router-dom'
import ListDepartmentComponent from './components/ListDepartmentComponent'
import DepartmentComponent from './components/DepartmentComponent'

// import HelloWorld from './HelloWorld'

function App() {

  return (
    <>
        <BrowserRouter>
            <HeaderComponent />
            <Routes>
              {/* // http://localhost:3000 */}
              <Route path='/' element={ <ListEmployeeComponent /> }></Route> 
              {/* // http://localhost:3000/employees */}
              <Route path='/employees' element={ <ListEmployeeComponent /> }></Route> 
              <Route path='/add-employee' element={ <EmployeeComponent /> }></Route> 
              {/* // http://localhost:3000/update-employee/1 */}
              <Route path='/update-employee/:id' element={ <EmployeeComponent /> }></Route>
              {/* <Route path='/delete-employee/:id' element={ <ListEmployeeComponent /> }></Route> */}
              <Route path='/departments' element={ <ListDepartmentComponent /> }></Route>
              <Route path='/add-department' element={ <DepartmentComponent /> }></Route>
              <Route path='/update-department/:id' element={ <DepartmentComponent /> }></Route>
              <Route path='/delete-department/:id' element={ <ListDepartmentComponent />}></Route>
            </Routes>
            <FooterComponent />
        </BrowserRouter>
    </>
  )
}

export default App
