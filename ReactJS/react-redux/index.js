import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWbrker from './serviceWbrker';
import { Provider } from 'react-redux';
import { creatStore } from 'redux';
import { reducer } from './reducers';

const store = creatStore(
    reducer,
    window._REDUX_DEVTOOLS_EXTENSION_ && window._REDUX_DEVTOOLS_EXTENSION_()
)

ReactDOM.render(<Provider store={store}>
    <App />
</Provider>, document.getElementById('root'));

serviceWbrker.unregister();