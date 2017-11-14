<template>
  <div class="container-fluid" id="app">
      <div class="row">
          <div class="col-md-4">
              <div class="alert alert-info" role="alert">
                  <h4>Thông tin khách hàng</h4>
              </div>
              <div class="list-group">
                  <a href="#" class="list-group-item" v-for="point in points">
                      <span class="pull-right" title="remove KH" @click="deleteNote(point.id)">
              <span class="glyphicon glyphicon-remove"></span>
                      </span>
                      <h4 class="list-group-item-heading">{{point.place}}</h4>
                      <p class="list-group-item-text">
                          {{point.type}}
                      </p>
                  </a>
              </div>
          </div>
          <div class="col-md-4">
              <form>
                  <legend>Đặt Grab</legend>
                  <div class="form-group">
                      <label for="txtNoteTitle">Địa điểm đón</label>
                      <input id="txtNoteTitle" type="text" class="form-control" placeholder="Nhập địa điểm" v-model="newNoteTitle">
                  </div>
                  <div class="form-group">
                      <label for="txtNoteContent">Loại xe</label>
                      <input id="txtNoteContent" type="text" class="form-control" placeholder="Nhập loại xe" v-model="newNoteContent">
                  </div>
                  <button type="button" class="btn btn-primary btn-block" @click="addNote">
            <span class="glyphicon glyphicon-ok"></span>
            Save
          </button>
              </form>
          </div>
      </div>
    </div>
</template>

<script>

import Firebase from 'firebase'

let config = {
  apiKey: 'AIzaSyBDOa513-q8BmPHmm1zlurdkkot3Z3bX-w',
  authDomain: 'grab-midterm.firebaseapp.com',
  databaseURL: 'https://grab-midterm.firebaseio.com',
  projectId: 'grab-midterm',
  storageBucket: 'grab-midterm.appspot.com',
  messagingSenderId: '495408687232'
}

let app = Firebase.initializeApp(config)
let db = app.database()

let pointsRef = db.ref('points')

export default {
  name: 'app',
  firebase: {
    points: pointsRef
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
