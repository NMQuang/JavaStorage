import Vue from 'vue'
import VueFire from 'vuefire'
import App from './App'

Vue.use(VueFire)

/* eslint-disable no-new */
/* eslint indent: ["error", "tab"] */
/* eslint indent: ["error", 4, { "VariableDeclarator": 1 }] */
/* eslint-env es6 */
/* eslint-disable eol-last */
/* eslint-env es6 */
/* eslint no-extra-semi: "error" */
new Vue({
    el: '#app',
    template: '<App/>',
    components: { App }
})