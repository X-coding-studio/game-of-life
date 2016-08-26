/*
 * A game inspired from Conway's Game Of Life.
 * Copyright (C) 2016 Huaji Studio.
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.huajistudio.gameoflife.gui.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import javafx.scene.canvas.Canvas;
import org.huajistudio.gameoflife.GameOfLife;
import org.huajistudio.gameoflife.api.util.I18n;

import java.io.IOException;
import java.util.ResourceBundle;

public class EditorController extends GridPane {
	@FXML public Canvas worldCanvas;
	@FXML public JFXButton playButton, saveButton;

	public EditorController() {
		FXMLLoader loader = new FXMLLoader(EditorController.class.getResource("/fxml/Editor.fxml"));
		loader.setResources(ResourceBundle.getBundle("language/language", GameOfLife.locale, new I18n.UTF8Control()));
		loader.setRoot(this);
		loader.setController(this);

		try {
			loader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}
}
