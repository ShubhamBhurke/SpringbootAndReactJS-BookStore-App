import React from 'react';
import storecomponents from '../services/StoreServices';
import { Table,Navbar } from 'react-bootstrap';
class StoreComponents extends React.Component {

    constructor(props) {
        super(props)
        this.state = {
            tables: []
        }
    }
    componentDidMount() {
        storecomponents.getStores().then((Response) => {
            this.setState({ tables: Response.data })
        });
    }

    render() {
        return (
            <div>
                <Navbar bg = "success">
                    <Navbar.Brand navbar href="#home">Available Books</Navbar.Brand>
                    <Navbar.Toggle />
                    <Navbar.Collapse className="justify-content-end">
                        
                    </Navbar.Collapse>
                </Navbar>
                <hr></hr>
                <table class="table">
                <Table striped bordered hover variant="success" >
                    <thead>
                        <tr>
                            <th>Book Id</th>
                            <th>Book Name</th>
                            <th>Author Name</th>
                            <th>Serial Number</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.tables.map(
                                table =>
                                    <tr key={table.id}>
                                        <td>{table.id}</td>
                                        <td>{table.bookName}</td>
                                        <td>{table.authorName}</td>
                                        <td>{table.serialNumber}</td>
                                    </tr>
                            )
                        }
                    </tbody>
                </Table>
                /</table>
            </div>
        )
    }
}
export default StoreComponents