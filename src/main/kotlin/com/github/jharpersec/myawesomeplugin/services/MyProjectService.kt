package com.github.jharpersec.myawesomeplugin.services

import com.github.jharpersec.myawesomeplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
