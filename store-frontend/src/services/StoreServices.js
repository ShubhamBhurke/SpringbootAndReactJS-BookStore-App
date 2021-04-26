import axios from 'axios'



const STORE_REST_API_URL = 'http://localhost:8080/Bookstore'

class StoreServices{
    getStores(){
        return axios.get(STORE_REST_API_URL);
    }
}
export default new StoreServices();