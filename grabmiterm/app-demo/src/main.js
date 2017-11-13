import Vue from 'vue'
import VueFire from 'vuefire'

Vue.user(VueFire)


new Vue({
    el: '#app',
    data: {
        notes: [],
        newNoteTitle: '',
        newNoteContent: ''
    },

    mounted: function() {
        var self = this;
        $.ajax({
            url: 'data/data.json',
            dataType: 'json',
            timeout: 10000
        }).then(function(data) {
            self.notes = data;
        }).fail(function(j, status, err) {
            console.log(err);
        });
    },

    methods: {
        addNote: function() {
            var self = this;
            var newNote = {
                title: self.newNoteTitle,
                content: self.newNoteContent
            };
            self.notes.push(newNote);

            self.newNoteTitle = '';
            self.newNoteContent = '';
        },
        deleteNote: function(d_title) {
            var self = this;
            var rs = confirm('delete note?');
            if (rs) {
                var d_idx = -1;
                $.each(self.notes, function(idx, value) {
                    if (value.title === d_title) {
                        d_idx = idx;
                        return;
                    }
                });

                self.notes.splice(d_idx, 1);
            }
        },
    }
});