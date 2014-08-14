/**
 * 
 */

jQuery(document).ready(function(){
	var form = jQuery('.national_register_import');
	form.find('.save-btn').click(function(){
		var path = form.find('[name="file-path"]').val();
		if(!path || (path=='')){
			alert('error');
			return;
		}
		showLoadingMessage('');
		ImportFromFileServices.importFromFile(path,{
			callback : function(reply){
				closeAllLoadingMessages();
				alert(reply);
			},
			errorHandler:function(message) {
				closeAllLoadingMessages();
				alert(message);
			}
		});
	});
});