package com.example.tp_sqllite

import android.provider.BaseColumns

class EtudiantBC(
    val nom: String,
    val prenom: String,
    val phone: String,
    val gender: String,
    val email: String,
    val mdp: String
) {

    class EtudiantEntry : BaseColumns {
        companion object {
            const val TABLE_NAME = "etudiant"
            const val COLUMN_NAME_NOM = "nom"
            const val COLUMN_NAME_PRENOM = "prenom"
            const val COLUMN_NAME_PHONE = "phone"
            const val COLUMN_NAME_GENDER = "gender"
            const val COLUMN_NAME_EMAIL = "email"
            const val COLUMN_NAME_MDP = "mdp"
        }
    }

    companion object {
        private const val TEXT_TYPE = " TEXT"
        private const val INT_TYPE = " INTEGER"
        private const val COMMA_SEP = ","

        const val SQL_CREATE_ENTRIES =
            "CREATE TABLE ${EtudiantEntry.TABLE_NAME} (" +
                    "${BaseColumns._ID}$INT_TYPE PRIMARY KEY$COMMA_SEP" +
                    "${EtudiantEntry.COLUMN_NAME_NOM}$TEXT_TYPE$COMMA_SEP" +
                    "${EtudiantEntry.COLUMN_NAME_PRENOM}$TEXT_TYPE$COMMA_SEP" +
                    "${EtudiantEntry.COLUMN_NAME_PHONE}$TEXT_TYPE$COMMA_SEP" +
                    "${EtudiantEntry.COLUMN_NAME_EMAIL}$TEXT_TYPE$COMMA_SEP" +
                    "${EtudiantEntry.COLUMN_NAME_GENDER}$TEXT_TYPE$COMMA_SEP" +
                    "${EtudiantEntry.COLUMN_NAME_MDP}$TEXT_TYPE)"

        const val SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS ${EtudiantEntry.TABLE_NAME}"
    }
}
